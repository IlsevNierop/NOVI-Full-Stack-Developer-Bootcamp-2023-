
    import java.text.DecimalFormat;
    import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                // define all variables
                boolean continueExchange = true;

                String inputCurrency = null;
                String inputToCurrency = null;
                String inputAmount = null;
                double currency1 = 0;
                double currency2 = 0;
                double newAmount = 0;
                double inputAmountMoney = 0;

                double dollar = 1;
                double euro = 0.92;
                double baht = 32.74;
                double yen = 128.71;
                double pound = 0.81;
                double bitcoin = 0.00004333525453;
//                double baseDollar= 1;

                Scanner myScanner = new Scanner(System.in);
                DecimalFormat df = new DecimalFormat("0.00");


                System.out.println("Welcome to our little scanner");
                System.out.println("From which currency do you want to exchange?");
                System.out.println("You can choose between Dollar, Euro, Baht, Yen, Pound and Bitcoin.");
                System.out.println("Or enter Quit to stop the program.");

                while (continueExchange) {
                    boolean stopLoopCurrency = false;
                    boolean stopLoopToCurrency = false;
                    boolean stopLoopInputAmountMoney = false;
                    boolean inputAmountMoneyIsNumeric = false;
                    boolean unkownContinueExchange = false;

                    while (!stopLoopCurrency) {
                        System.out.println("-------------------------------------------");
                        inputCurrency = myScanner.nextLine();
                        inputCurrency = inputCurrency.substring(0, 1).toUpperCase() + inputCurrency.substring(1).toLowerCase();

                        switch (inputCurrency) {
                            case "Dollar":
                                currency1 = dollar;
                                stopLoopCurrency = true;
                                break;
                            case "Euro":
                                currency1 = euro;
                                stopLoopCurrency = true;
                                break;
                            case "Baht":
                                currency1 = baht;
                                stopLoopCurrency = true;
                                break;
                            case "Yen":
                                currency1 = yen;
                                stopLoopCurrency = true;
                                break;
                            case "Pound":
                                currency1 = pound;
                                stopLoopCurrency = true;
                                break;
                            case "Bitcoin":
                                currency1 = bitcoin;
                                stopLoopCurrency = true;
                                break;
                            case "Quit":
                                stopLoopCurrency = true;
                                continueExchange = false;
                                break;
                            default:
                                System.out.println("This is not a valid currency. Please choose between: Dollar, Euro, Baht, Yen, Pound or Bitcoin.");


                        }
                    }

                    System.out.println("You've chosen to exchange " + inputCurrency + " into another currency");

                    System.out.println("To which currency do you want to exchange? ");
                    System.out.println("You can choose between Dollar, Euro, Baht, Yen, Pound and Bitcoin.");

                    while (!stopLoopToCurrency) {
                        System.out.println("-------------------------------------------");
                        inputToCurrency = myScanner.nextLine();
                        inputToCurrency = inputToCurrency.substring(0, 1).toUpperCase() + inputToCurrency.substring(1).toLowerCase(); //capitalize first letter and rest lowercase

                        switch (inputToCurrency) {
                            case "Dollar":
                                currency2 = dollar;
                                stopLoopToCurrency = true;
                                break;
                            case "Euro":
                                currency2 = euro;
                                stopLoopToCurrency = true;
                                break;
                            case "Baht":
                                currency2 = baht;
                                stopLoopToCurrency = true;
                                break;
                            case "Yen":
                                currency2 = yen;
                                stopLoopToCurrency = true;
                                break;
                            case "Pound":
                                currency2 = pound;
                                stopLoopToCurrency = true;
                                break;
                            case "Bitcoin":
                                currency2 = bitcoin;
                                stopLoopToCurrency = true;
                                break;
                            case "Quit":
                                stopLoopToCurrency = true;
                                continueExchange = false;
                                break;
                            default:
                                System.out.println("This is not a valid currency. Please choose between: Dollar, Euro, Baht, Yen, Pound or Bitcoin.");


                        }
                    }

                    System.out.println("How much " + inputCurrency + " do you want to exchange to " + inputToCurrency + " ?");
                    System.out.println("Please write down your amount in numbers.");

                    while (!stopLoopInputAmountMoney) {
                        System.out.println("Or enter Quit to stop the program.");
                        System.out.println("-------------------------------------------");
                        inputAmount = myScanner.nextLine();

                        String sInputAmountMoney = inputAmount.replace(",", ".");

                        if (sInputAmountMoney.equalsIgnoreCase("quit")) {
                            System.out.println("Thank you for using our exchanged program. Have a good day!");
                            stopLoopInputAmountMoney = true;
                            continueExchange = false;
                            break;
                        } else if (!inputAmountMoneyIsNumeric) {
                            try {
                                inputAmountMoney = Double.parseDouble(sInputAmountMoney);

                                stopLoopInputAmountMoney = true;
                                break;
                            } catch (Exception e) {
                                System.out.println("This is not a valid number, please enter the amount you want to exchange (in numbers). ");
                                stopLoopInputAmountMoney = false;
                                continue;
                            }
                        }
                    }

                    newAmount = (inputAmountMoney / currency1 * currency2);
                    System.out.println(df.format(inputAmountMoney) + " " + inputCurrency + " is " + df.format(newAmount) + " " + inputToCurrency);

                    System.out.println("Do you want to make another exchange? Yes or No?");

                    while (!unkownContinueExchange) {
                        System.out.println("-------------------------------------------");
                        String inputContinueExchange = myScanner.nextLine();
                        inputContinueExchange = inputContinueExchange.substring(0, 1).toUpperCase() + inputContinueExchange.substring(1).toLowerCase();

                        switch (inputContinueExchange) {
                            case "Yes":
                                System.out.println("Ok, here we go again, enjoy!");
                                System.out.println("From which currency do you want to exchange?");
                                System.out.println("You can choose between Dollar, Euro, Baht, Yen, Pound and Bitcoin.");
                                System.out.println("Or enter Quit to stop the program.");
                                unkownContinueExchange = true;
                                break;
                            case "No":
                                unkownContinueExchange = true;
                                continueExchange = false;
                                System.out.println("Thank you for using our exchanged program. Have a good day!");
                                break;
                            default:
                                System.out.println("This is not a valid answer. Please choose between: Yes or No.");


                        }


                    }
                }


            }
        }





//String inputAmount = inputMoney.replace(",", ".");




