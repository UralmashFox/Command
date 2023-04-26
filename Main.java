public class Main {
    public static void main(String[] args) {
        AcademicalLeave  testLeave = new AcademicalLeave( );
        AcademicalLeaveCommand testALC = new AcademicalLeaveCommand(testLeave);
        AcademicalReturnCommand testARC = new AcademicalReturnCommand(testLeave);

        Switch testSwitch = new Switch(testALC,testARC);
        testSwitch.flipUp( );
        testSwitch.flipDown( );

        ExamPass testPass = new ExamPass( );
        PassExamCommand pec = new PassExamCommand(testPass);
        FailExamCommand fec = new FailExamCommand(testPass);

        Switch ep = new Switch(pec,fec);
        ep.flipUp( );
        ep.flipDown( );
    }
}