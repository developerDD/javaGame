package com.CodeWars;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllStrings {
    /**
     * Предположим, мы знаем процесс, с помощью которого строка s была закодирована в строку r(см. Пояснение ниже).
     * Целью ката является декодирование этой строки, r чтобы получить исходную строку s.
     * <p>
     * Объяснение процесса кодирования:
     * input: строка, s состоящая из строчных букв от "a" до "z" и положительного целого числа num
     * мы знаем, что есть соответствие между abcde...uvwxyz и 0, 1, 2 ..., 23, 24, 25:0 <-> a, 1 <-> b ...
     * Если c это символ s, соответствующий номер которого x, примените к x функции f: x-> f(x) = num * x % 26, а затем найдите ch соответствующий
     * символ f(x)
     * Накопить все это chв строку r
     * объединить num и r вернуть результат
     * Например:
     * encode("mer", 6015)  -->  "6015ekx"
     * m --> 12,   12 * 6015 % 26 = 4,    4  --> e
     * e --> 4,     4 * 6015 % 26 = 10,   10 --> k
     * r --> 17,   17 * 6015 % 26 = 23,   23 --> x
     * <p>
     * So we get "ekx", hence the output is "6015ekx"
     *
     * @param r закодированая в строка
     * @return декодирование этой строки, r чтобы получить исходную строку s
     */
    public static String decode(String r) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String num = r.replaceAll("\\D", "");
        String words = r.replaceAll("\\d", "");
        StringBuilder decodeString = new StringBuilder();
        int number = Integer.parseInt(num);
        int indexInput;
        int indexOutput = -1;
        int indexCode;
        int flag = 0;
        int Impossible;
        while (flag != words.length()) {
            indexInput = abc.indexOf(words.charAt(flag));
            Impossible = 0;
            for (int i = 0; i < 26; i++) {
                indexCode = i * number % 26;
                if (indexCode == indexInput) {
                    if (Impossible == 0) {
                        indexOutput = i;
                    } else {
                        return "Impossible to decode";
                    }
                    Impossible++;
                }
            }
            decodeString.append(abc.charAt(indexOutput));
            flag++;
        }
        return decodeString.toString();
    }

    // кодирование строки
    public static String code(String s, int num) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int indexInput;
        int indexOutput;
        int flag = 0;
        StringBuilder codeStr = new StringBuilder();
        //codeStr.append(num);
        while (flag != s.length()) {
            indexInput = abc.indexOf(s.charAt(flag));
            indexOutput = num * indexInput % 26;
            codeStr.append(abc.charAt(indexOutput));
            flag++;
        }

        return codeStr.toString();
    }

    /**
     * Напишите метод, который принимает один аргумент в качестве имени,
     * а затем встречает это имя с большой буквы и заканчивается восклицательным знаком.
     * Пример:
     * "riley" --> "Hello Riley!"
     * "JACK"  --> "Hello Jack!"
     */
    public static String greet(String name) {
        String allWithOutFirst = name.toLowerCase().substring(1, name.length());
        String first = name.toUpperCase().substring(0, 1);
        return "Hello " + first + allWithOutFirst + "!";
    }

    public AllStrings() {
    }

    public static String RemoveFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    // one number in string
    public static boolean isDigit(String s) {
        if (s.isEmpty()) return false;
        return s.matches("\\d{1}");
        //поиск числа в строке //str[i].matches("^\\d*$")
    }

    //del Space
    static String noSpace(final String x) {

        return new String(x.replaceAll("\\s", ""));
    }

    public static String ReversedStrings(String str) {
        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse().toString();
    }

    public static Object[] dbSort(Object[] a) {
        int countNumber = 0;
        int countWord = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Number) {
                countNumber++;
            } else {
                countWord++;
            }
        }
        int[] arrNumber = new int[countNumber];
        String[] arrWord = new String[countWord];

        for (int i = 0, j = 0, h = 0; i < a.length; i++) {
            if (a[i] instanceof Number) {
                arrNumber[j] = ((Number) a[i]).intValue();
                ;
                j++;
            } else {
                arrWord[h] = a[i].toString();
                h++;
            }
        }
        Arrays.sort(arrNumber);
        Arrays.sort(arrWord);
        Object[] result = new Object[countNumber + countWord];
        for (int i = 0, h = 0; i < result.length; i++) {

            if (i < countNumber) {
                result[i] = (Object) arrNumber[i];

            } else {
                result[i] = (Object) arrWord[h];
                h++;
            }
        }
        return result;


        //java 8
        /*return Stream.concat(
                Arrays.stream(a).filter((x)-> x instanceof Number).map((x)->(Number)x).sorted()
                ,Arrays.stream(a).filter((x)->x instanceof String).map((x)->(String)x).sorted()
        ).toArray();*/
    }

    /**
     * /*
     * * public static int toInt(Object obj)
     * {
     * if (obj instanceof String)
     * {
     * return Integer.parseInt((String) obj);
     * } else if (obj instanceof Number)
     * {
     * return ((Number) obj).intValue();
     * } else
     * {
     * String toString = obj.toString();
     * if (toString.matches("-?\d+"))
     * {
     * return Integer.parseInt(toString);
     * }
     * throw new IllegalArgumentException("This Object doesn't represent an int");
     * }
     * }
     * *
     */

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        StringBuffer buffer = new StringBuffer(s[0]);
        for (int i = 1, j = 1; j < s[0].length(); i += 4, j++) {
            buffer.insert(i, "***");
        }
        //java 8 return String.join("***",s[0].split(""));
        return buffer.toString();
    }

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(5);
        int f = 0;
        for (int i = 0; i < word.length(); i++) {
            f = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    f++;
                }
            }
            if (f > 1 && f != 0) {
                stringBuilder.append(')');
            } else {
                stringBuilder.append('(');
            }
        }

        return stringBuilder.toString();
    }
    /*Write a function that will return the count of distinct case-insensitive alphabetic characters
     and numeric digits that occur more than once in the input string.
    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.*/

    public static int duplicateCount(String text) {

        StringBuilder stringBuilder = new StringBuilder(text.toLowerCase());
        int duplicate = 0;
        boolean flag = false;
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            if ('*' == stringBuilder.charAt(i)) {
                continue;
            } else {
                for (int j = i + 1; j < stringBuilder.length(); j++) {
                    if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                        stringBuilder.replace(j, j + 1, "*");
                        flag = true;
                    }
                }
                if (flag) {
                    stringBuilder.replace(i, i + 1, "*");
                    duplicate++;
                }
            }
            flag = false;
        }

        return duplicate;
    }

    public static String removeDuplicateWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<String> stringHashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (stringHashSet.contains(arr[i])) {
                continue;
            } else {
                if (i > 0) stringBuilder.append(" ");
                stringHashSet.add(arr[i]);
                stringBuilder.append(arr[i]);
            }

        }
        return stringBuilder.toString();
        //java 8 return Arrays.stream( s.split("\\s+")).distinct().collect(Collectors.joining(" ") );
    }

    /**
     * Usually when you buy something, you're asked whether your credit card number,
     * phone number or answer to your most secret question is still correct.
     * However, since someone could look over your shoulder, you don't want that shown on your screen.
     * Instead, we mask it.
     * Your task is to write a function maskify, which changes all but the last four characters into '#'.
     */
    public static String maskify(String str) {
        if (str.length() < 4) return str;
        String substring = str.substring(0, str.length() - 4);
        String stringReplace = substring.replaceAll(".", "#");
        stringReplace += str.substring(str.length() - 4, str.length());
        return stringReplace;
        //return str.replaceAll(".(?=.{4})", "#");
    }

    /**
     * Task:
     * You have to write a function pattern which returns the following Pattern (See Pattern & Examples) upto n number of rows.
     * <p>
     * Note: Returning the pattern is not the same as Printing the pattern.
     * Rules/Note:
     * If n < 1 then it should return "" i.e. empty string.
     * There are no whitespaces in the pattern.
     * Pattern:
     * (n)(n-1)(n-2)...4321
     * (n)(n-1)(n-2)...432
     * (n)(n-1)(n-2)...43
     * (n)(n-1)(n-2)...4
     * ...............
     * ..............
     * (n)(n-1)(n-2)
     * (n)(n-1)
     * (n)
     */
    public static String pattern(int n) {
        //Happy Coding ^_^
        if (n < 1) return "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                stringBuilder.append(j);
            }
            if (i != n - 1) {
                stringBuilder.append('\n');
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Если задана строчная строка, состоящая только из буквенных символов и без пробелов,
     * вернуть наибольшее значение согласных подстрок. Согласные - это любые буквы алфавита, кроме "aeiou".
     * <p>
     * Мы должны присвоить следующие значения: a = 1, b = 2, c = 3, .... z = 26.
     */
    public static int ConsonantValue(final String s) {
        Map<Character, Integer> abcBook = new HashMap<>();
        String[] arr = s.split("[aeiou]");
        for (int i = 97, v = 1; i < 123; i++, v++) {
            abcBook.put(Character.valueOf((char) i), v);
        }
        int sum = 0, sumMax = 0;
        char[] currentCharArr;
        char currentChar;
        for (int i = 0; i < arr.length; i++) {
            currentCharArr = arr[i].toCharArray();

            for (int i1 = 0; i1 < currentCharArr.length; i1++) {
                currentChar = currentCharArr[i1];

                for (Map.Entry<Character, Integer> item : abcBook.entrySet()) {
                    if (item.getKey() == currentChar) {
                        sum += item.getValue();
                        break;
                    }
                }
            }
            if (sum > sumMax) {
                sumMax = sum;
                sum = 0;
            } else {
                sum = 0;
            }
        }

        return sumMax;
    }

    /**
     * Завершите решение так, чтобы оно разбивало строку на пары из двух символов.
     * Если строка содержит нечетное количество символов, тогда следует заменить отсутствующий второй символ
     * последней пары подчеркиванием ('_').
     */
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s.concat("_");
        }
        String[] arr = new String[(int) Math.ceil(s.length() / 2d)];
        int size = arr.length;
        StringBuilder stringBuilder = new StringBuilder();
        char[] arrChar = s.toCharArray();
        for (int i = 0, k = 0; i < arrChar.length; i += 2, k++) {
            stringBuilder.append(arrChar[i]);
            stringBuilder.append(arrChar[i + 1]);
            arr[k] = stringBuilder.toString();
            stringBuilder.delete(0, 2);
        }
        return arr;
        // best с помощью регулярки
        //s = (s.length() % 2 == 0)?s:s+"_";
        //        return s.split("(?<=\\G.{2})");
    }

    /**
     * В состав действующей команды должно входить не менее 2 работников. Вы должны подсчитать ,
     * сколько в силе команд этой компании, и перечислить имена своих членов в формате:
     * {N_OF_VALID_TEAMS}:{COMMA_SEPARATED_NAMES}.
     * s = "A:Stefan,Milica,Zvonimir,AndrewH:Richard"
     * mix(s) == "1:Stefan,Milica,Zvonimir,Andrew"
     * <p>
     * s = "W:John,John,John,JohnC:Danger,Man"
     * mix(s) == "2:John,John,John,John,Danger,Man"
     */
    public static String validate(String s) {
        String[] h = s.split("[[A-Z]{1}]:");
        String res = "";
        int count = 0;
        for (String string : h) {
            if (string.length() == 0) continue;
            if (string.split(",").length > 1) {
                count++;
                res += string + " ";
            }
        }
        res = res.trim();
        res = res.replaceAll(" ", ",");
        res = res.replaceAll(",,", ",");
        System.out.println("count = " + count + ": " + res);
        return count + ":" + res;
    }

    /**
     * Определите общее количество цифр в целых числах ( n>=0),
     * указанных в качестве входных данных для функции. Например,
     * 9 представляет собой одну цифру, 66 имеет 2 цифры, а 128685 имеет 6 цифр.
     * Будьте осторожны, чтобы избежать переполнения / переполнения.
     */
    public static int Digits(long n) {
        return String.valueOf(n).length();
    }

    /**
     * Напишите функцию, которая принимает строку из одного или нескольких слов и возвращает ту же строку,
     * но со всеми пятью или более буквенными словами в обратном порядке (точно так же, как имя этого ката).
     * Переданные строки будут состоять только из букв и пробелов.
     * Пробелы будут включены только при наличии более одного слова.
     */
    public static String spinWords(String sentence) {
        //TODO: Code stuff here
        StringBuilder strB = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                strB.append(new StringBuilder(words[i]).reverse() + " ");
                continue;
            }
            strB.append(words[i] + " ");
        }
        return strB.toString().trim();
    }

    /**
     * Переместите первую букву каждого слова в конец,
     * затем добавьте «ay» в конец слова. Оставьте знаки препинания нетронутыми.
     * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
     * pigIt('Hello world !');     // elloHay orldway !
     */
    public static String pigIt(String str) {
        String[] words = str.split("\\s+");
        String newStr = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("\\w*")) {
                String first = String.valueOf(words[i].charAt(0));
                newStr = words[i].substring(1);
                newStr += first + "ay";
                words[i] = newStr;
                newStr = "";
            }
        }
        return String.join(" ", words);
        // best return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    /**
     * Напишите функцию, которая принимает двоичную строку и возвращает эквивалентный декодированный текст
     * (текст в кодировке ASCII).
     * Каждые 8 ​​битов в двоичной строке представляют 1 символ в таблице ASCII.
     * Входная строка всегда будет допустимой двоичной строкой.
     * Символы могут быть в диапазоне от «00000000» до «11111111» (включительно)
     * Примечание. В случае пустой двоичной строки ваша функция должна возвращать пустую строку.
     */
    public static String binaryToText(String binary) {
        String abc = "";
        if (binary.length() == 0) return abc;
        StringBuilder res = new StringBuilder();
        for (int startIndex = 0, endIndex = 8; endIndex <= binary.length(); startIndex += 8, endIndex += 8) {
            abc = (String) binary.subSequence(startIndex, endIndex);
            res.append((char) Integer.parseInt(abc, 2));
        }
        return res.toString();
    }

    /**
     * Напишите простой парсер, который будет анализировать и запускать Deadfish.
     * <p>
     * У Deadfish есть 4 команды, каждая длиной 1 символ:
     * <p>
     * iувеличивает значение (изначально 0)
     * d уменьшает значение
     * s возводит в квадрат значение
     * o выводит значение в возвращаемый массив
     * Неверные символы следует игнорировать.
     */
    public static int[] parse(String data) {
        List<Integer> arr = new ArrayList<>();
        int[] res;
        char[] arrData = data.toCharArray();
        int number = 0;
        for (int i = 0; i < arrData.length; i++) {
            switch (arrData[i]) {
                case 'i':
                    number++;
                    break;
                case 'd':
                    number--;
                    break;
                case 's':
                    number = (int) Math.pow(number, 2);
                    break;
                case 'o':
                    arr.add(number);
                    break;
                default:
                    continue;
            }
        }
        res = new int[arr.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr.get(i);
        }
        return res;
    }

    /**
     * Ваша задача - отсортировать заданную строку. Каждое слово в строке будет содержать одно число.
     * Это число - позиция, которую слово должно занимать в результате.
     * Примечание: числа могут быть от 1 до 9. Таким образом, 1 будет первым словом (не 0).
     * Если входная строка пуста, вернуть пустую строку. Слова во входной строке будут содержать только действительные последовательные числа.
     * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
     * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
     * ""  -->  ""
     */
    public static String order(String words) {
        if (words.length() == 0) return "";
        String[] d = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String pa;
        Pattern pattern;
        Matcher matcher;
        int size = words.split("\\s").length;
        String[] resalt = new String[size];
        for (int i = 0; i < size; i++) {
            pa = "\\w*" + d[i] + "\\w*";
            pattern = Pattern.compile(pa);
            matcher = pattern.matcher(words);
            while (matcher.find()) {
                resalt[i] = (matcher.group());
            }
        }
        return String.join(" ", resalt);
    }

    /**
     * Для построения зашифрованной строки:
     * возьмите каждый второй символ из строки, затем другие символы, которые не являются каждым вторым символом, и объедините их как новую строку.
     * Сделайте это n раз!
     * Примеры:
     * "This is a test!", 1 -> "hsi  etTi sats!"
     * "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
     *
     * @param text входная строка для кодирования
     * @param n    количество перестановок
     * @return строку которую изменили
     */
    public static String encrypt(final String text, final int n) {
        // Your code here
        if (n < 1) return text;
        StringBuilder strEven = new StringBuilder();
        StringBuilder strNoEven = new StringBuilder();
        String encryptStr = text;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < encryptStr.length(); i++) {
                if (i % 2 == 0) {
                    strEven.append(encryptStr.charAt(i));
                } else {
                    strNoEven.append(encryptStr.charAt(i));
                }
            }
            if (j == n - 1) {
                return encryptStr = strNoEven.toString() + strEven;
            } else {
                encryptStr = "";
                encryptStr = strNoEven.toString() + strEven;
                strEven = strEven.delete(0, strEven.length());
                strNoEven = strNoEven.delete(0, strNoEven.length());
            }
        }
        return null;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        //что бы разшифровать запись
        // нужно соеденить строку поочередно брать символы начиная со сридины  и с начала строки
        if (n < 1) return encryptedText;
        StringBuilder addStr = new StringBuilder();
        String encryptStr = encryptedText;
        int middleIndex = 0;
        middleIndex = (encryptedText.length() / 2);
        int fixIndex = middleIndex;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < encryptStr.length() / 2; i++, middleIndex++) {
                addStr.append(encryptStr.charAt(middleIndex));
                addStr.append(encryptStr.charAt(i));
            }
            if (encryptedText.length() % 2 != 0) {
                addStr.append(encryptStr.charAt(middleIndex));
            }
            if (j == n - 1) {
                return encryptStr = addStr.toString();
            } else {
                encryptStr = "";
                encryptStr = addStr.toString();
                addStr = addStr.delete(0, addStr.length());
                middleIndex = fixIndex;
            }
        }
        return null;
    }

    /**
     * На фабрике принтер печатает этикетки для коробок.
     * Использованию принтера цвета , которые для простоты названы буквами от а до г
     * Цвета, используемые принтером, записываются в управляющую строку.
     * Например, управляющая строка будет aaabbbbhaijjjm означать, что принтер использовал три раза цвета
     * a, четыре раза цвет b, один раз цвет h, затем один раз цвет a ... и так далее.
     * Иногда возникают проблемы: отсутствие цветов, техническая неисправность
     * и строка управления производится , например , uuaaaxbbbbyyhwawiwjjjwwxym где
     * ошибки сообщается с буквами u, w, x или z.
     *
     * @param s входная строка с ошибками принтера (букв u, w, x или z  это ошибки)
     * @return вернуть строку с ошибками и их количеством
     */
    public static String hist(String s) {
        // your code
        String[] colErrors = new String[4];
        StringBuilder resultStr = new StringBuilder();
        char[] arrErrors = {'u', 'w', 'x', 'z'};
        String errors = s.replaceAll("[^uzxw]", "");
        if (errors.length() == 0) return errors;// если нет ошибок
        for (int i = 0; i < colErrors.length; i++) {
            colErrors[i] = errors.replaceAll("[^" + arrErrors[i] + "+]", "");
            if (colErrors[i].length() != 0) {

                char[] chars = new char[colErrors[i].length()];//количество *
                char[] prob = new char[6 - Integer.toString(colErrors[i].length()).length()];//количество пробелов между числом и *
                Arrays.fill(chars, '*');
                Arrays.fill(prob, ' ');
                resultStr.append(arrErrors[i]).append("  ").
                        append(colErrors[i].length()).
                        append(prob).
                        append(chars).append('\r');
            }
        }
        return resultStr.deleteCharAt(resultStr.length() - 1).toString();
    }

    /**
     * Перевести линкед лис в строковое представление
     *
     * @param list линкед лист
     * @return строку в виде "1 -> 2 -> 3 -> null"
     */
    public static String stringify(Node list) {
        // Your code here.
        if (list == null) return "null";
        StringBuilder resultStr = new StringBuilder();
        while (list.getNext() != null) {
            resultStr.append(list.getData()).append(" -> ");
            list = list.getNext();
        }
        resultStr.append(list.getData()).append(" -> ").append("null");
        return resultStr.toString();
    }

    public class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
}


