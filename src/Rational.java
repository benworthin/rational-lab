class Rational {

    //Instance variables
    private int firstNum, firstDen, reducedNum, reducedDen, gcf = 0;
    private double decimal = 0.0;
    private String originalFraction, reducedFraction = "";

    //Constructor
    public Rational(int firstNum, int firstDen) {

        this.firstNum = firstNum;
        this.firstDen = firstDen;

        reduce();

    }

    public void displayData() {

        System.out.println("\n" + getOriginalFraction() + " equals " + getDecimal());
        System.out.println("\nand reduces to " + getReducedFraction());


    }

    private void getGCF(int n1, int n2) {

        int rem = 0;
        do {

            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else {

                n1 = n2;
                n2 = rem;

            }

        }

        while (rem != 0);

    }

    public void reduce() {

        getGCF(firstNum, firstDen);

        reducedNum = firstNum / gcf;
        reducedDen = firstDen / gcf;

    }

    //Getter methods
    public int getFirstNum() {

        return firstNum;

    }

    public int getFirstDen() {

        return firstDen;

    }

    public double getDecimal() {

        double numv2 = firstNum;
        double denv2 = firstDen;

        decimal = numv2 / denv2;

        return decimal;

    }

    public String getOriginalFraction() {

        originalFraction = firstNum + "/" + firstDen;

        return originalFraction;

    }

    public String getReducedFraction() {

        reducedFraction = reducedNum + "/" + reducedDen;

        return reducedFraction;

    }
}