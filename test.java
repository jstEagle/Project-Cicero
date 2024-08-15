public class test {

    public static void main(String[] args) {
        String test = "### Conjugate pair";

        String result = checkHeadings(test);

        System.out.println(test + "\n" + result);
    }

    public static String checkHeadings(String line) {
        line = line.trim();
        char[] chars = line.toCharArray();
        int num = 0;

        if (chars.length > 0 && chars[0] == '#') {
            num = 1;
            while (num < chars.length && chars[num] == '#') {
                num++;
            }
        } else {
            return line;
        }

        int headingLevel = Math.min(num, 6);
        return "<h" + headingLevel + ">" + line.substring(num).trim() + "</h" + headingLevel + ">";
    }
}
