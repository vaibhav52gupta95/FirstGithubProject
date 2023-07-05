public class GoalParser {
    public static void main(String args[]){
        String command = "G()(al)";
        System.out.println(GoalParser.interpret(command));
    }
    public static String interpret(String command) {
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
}
