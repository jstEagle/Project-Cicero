public class test {

    public static void main(String[] args) {
        String test = "The ancient Greeks thought $x+10=9$ had no solution because no one had thought of negative numbers.";
        String secondTest = "$$x = \\pm 14i$$";
        String thirdTest = "<Katex>### Conjugate pair<Katex/>";
        String lineTest = "_____";

        String result = textStyling(lineTest);

        System.out.println(lineTest + "\n" + result);
    }

    public static String textStyling(String line) {
        line = line.trim();

        if (line.length() > 0) {
            boolean flag = true;
            char[] c = line.toCharArray();
            for (char x : c) {
                if (x != '-' && x != '_') {
                    flag = false;
                    break;
                }
            }

            if (flag && line.length() >= 3) {
                return "<h3><center>_________________________</center></h3>";
            }
        }
        
        line = line.replaceAll("\\*\\*(.*?)\\*\\*", "<b>" + "$1" + "</b>");
        return line.replaceAll("_(.?)_", "<i>" + "$1" + "</i>");
    }

    public static String translateHeadings(String line) {
        line = line.trim();
        char[] chars = line.toCharArray();
        int num = 0;
        boolean flag = false;

        if (chars.length > 0) {
            for(int i = 0; i < chars.length; i++) {
                if(chars[i] == '#') {
                    flag = true;
                    while(chars[i] == '#') {
                        num++;
                        i++;
                    }
                    break;
                }
            }
        } else {
            return line;
        }

        int headingLevel = Math.min(num, 6);
        if(flag) {
            return "<h" + headingLevel + ">" + line.replace("#", "") + "</h" + headingLevel + ">";
        }
        return line;
    }

    public static String translateInlineEquations(String line) {
        line = line.trim();
        return line.replaceAll("\\$(.*?)\\$", "<Katex math={\"" + "$1" + "\"}/>");
    }

    public static String translateDisplayEquations(String line) {
        line = line.trim();
        return line.replaceAll("\\$\\$(.*?)\\$\\$", "<Katex math={\"" + "$1" + "\"} displayMode/>");
    }
}
