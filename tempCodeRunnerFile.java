public static boolean KtraTN(int num) {
        String check = Integer.toString(num);
        if((check.length() % 2) == 1 && (check.charAt(check.length() / 2 + 1) -'0') % 2 == 1) {
            for(int i = 0; i < check.length() /2; i++) {
                if((check.charAt(i) - '0') != (check.charAt(check.length() - i - 1) - '0') && (check.charAt(i) - '0') % 2 != 1) {
                    return false;
                }
            }
        } else return false;

        return true;
    }