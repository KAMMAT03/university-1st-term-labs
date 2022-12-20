public class Prefix {
    public static void main(String[] args) {
        String [] arr = {"kokos", "koktajl", "kokret", "kokosy"};
        System.out.println(getPrefix(arr));

    }

    public static String getShortest(String [] arr){
        String shortest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i].length() < shortest.length()){
                shortest = arr[i];
            }
        }
        return shortest;
    }

    public static String getPrefix(String[] arr){
        StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < getShortest(arr).length(); i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j].charAt(i) != arr[j + 1].charAt(i)) {
                        return prefix.toString();
                    }
                }
                prefix.append(getShortest(arr).charAt(i));
            }
        return "";
    }

}
