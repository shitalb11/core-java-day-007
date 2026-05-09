package org.example.java8features;

public class T {
    public static void main(String[] args) {
            interface NumberProcessor{
                  int add(int number1, int number2);
            }
            //1.traditional way
            class NumberProcessorImpl implements NumberProcessor{
                @Override
            public int add(int number1, int number2){
                    return number1 + number2;
                }
            }
            NumberProcessor numberProcessor = new NumberProcessorImpl();
            System.out.println("traditional way add is = " + numberProcessor.add(100,200));


            //2.anonymous way
            NumberProcessor anonymous = new NumberProcessor() {
                @Override
                public int add(int number1, int number2) {
                    return number1+number2;
                }
            };
            System.out.println("anonymous way add is = " + anonymous.add(100, 200));


            //3.lambda expression way
            NumberProcessor ref = T::sumOfTwoNumbers;
            System.out.println("Method reference way =" + ref.add(100,200));


            //4.Method reference way
            NumberProcessor ref1 = T::sumOfTwoNumbers;
            System.out.println("Method reference way1 =" + ref1.add(100, 200));

            NumberProcessor ref2 = Integer::sum;
            System.out.println("Method reference way2 " + ref2.add(100, 200));



    }

    private static int sumOfTwoNumbers(int number1, int number2) {
        return number1+number2;
    }
}
