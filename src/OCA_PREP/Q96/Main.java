package OCA_PREP.Q96;

import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);

    }
    public static void callExport(Exportable ex){

    }
}
/*What is the result?
A.	Compilation fails only at line n1.
B.	Compilation fails only at line n2.
C.	Tool::exportTool::export
D.	Compilation fails at both line n1 and line2.
E.	RTool::exportTool::export
*/
