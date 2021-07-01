package de.iad.ef.model;
class TestSuiteApp {
    public static void main(String[] args) {
    /*BasicCounter counter= new BasicCounter() {
        @Override
        protected void setCount(Integer count) {
            super.setCount(count);
        }

        @Override
        protected void count() {
            super.count();
        }

        @Override
        protected void uncount() {
            super.uncount();
        }

        @Override
        public Integer currentCount() {
            return super.currentCount();
        }

        @Override
        public void reset() {
            super.reset();
        }
    }*/

        /*BasicCounterTest Testumgebung = new BasicCounterTest();

        LimitedCounterTest testumgebung = new LimitedCounterTest();
        LimitedCounterTest.Tester tester= testumgebung.new Tester(-10,42);
        RolloverCounter counter = new RolloverCounter();*/
        new StopCounterTest().start();

        /*System.out.println("Test Standard Konstruktor erwartet 0" +
                (counter.currentCount()==0 ? " ok":"fehler"));
        counter.setCount(999);
        System.out.println("Test Standard Obergrenze erwartet 999" +
                (counter.currentCount()==999 ? " ok":"fehler"));
        counter.count();
        System.out.println("Test Überlauf erwartet 0" +
                (counter.currentCount()==0 ? " ok":"fehler"));



        testsBasicCounter(Testumgebung);
        testStandart_Konstruktor_MaximumIs_MaximumReached(tester);*/

    }

    private static void testStandart_Konstruktor_MaximumIs_MaximumReached(LimitedCounterTest.Tester tester) {

        System.out.println("Test maximumIs erwartet -10 und geliefert wird -10"+
                (tester.minimumIs()==-10 ? " ok":"fehler"));
        System.out.println("Test is maximumreached erwarte true und geliefert wird true"+
                (tester.isMinimumReached()==true ?" ok":"fehler"));
        tester.count();
        System.out.println("Test isMaximumReached erwarted false und geliefert wird false"+
                (tester.isMinimumReached()==false ? " ok":"fehler"));
        System.out.println("Test Standard Konstruktor erwartet 0 und geliefert wird 0"+
                (tester.currentCount()==0 ? " ok":"fehler"));
        System.out.println("Test maximumIs erwartet 999 und geliefert wird 999"+
                (tester.maximumIs()==999 ? " ok":"fehler"));
        System.out.println("Test is maximumreached erwarte false und geliefert wird false"+
                (tester.isMaximumReached()==false ?" ok":"fehler"));
        tester.setCount(999);
        System.out.println("Test isMaximumReached erwarted true und geliefert wird true"+
                (tester.isMaximumReached()==true ? " ok":"fehler"));
    }

    private static void testsBasicCounter(BasicCounterTest Testumgebung) {
        BasicCounterTest.Tester tester = Testumgebung.new Tester();
        System.out.println("Test Parameter Konstruktor erwartet 0 und geliefert wird 0"+
                (tester.currentCount()==0 ? " ok":"fehler"));

        tester = Testumgebung.new Tester(4711);
        System.out.println("Test Parameter Konstruktor erwartet 4711 und geliefert wird 4711"+
                (tester.currentCount()==4711 ? " ok":"fehler"));


        tester = Testumgebung.new Tester(42);
        ;
        tester.setCount(4711);
        System.out.println("Test Parameter Konstruktor erwartet 4711 und geliefert wird 4711"+
                (tester.currentCount()==4711 ? " ok":"fehler"));
        tester.reset();
        System.out.println("Test Reset Konstruktor erwartet 42 und geliefert wird 42"+
                (tester.currentCount()==42 ? " ok":"fehler"));
    }
}
class BasicCounterTest {

    class Tester extends BasicCounter {
        public Tester() {
            super();

        }

        public Tester(Integer initVal) {
            super(initVal);
        }

        @Override
        public Integer currentCount() {
            return super.currentCount();
        }

        @Override
        public void reset() {
            super.reset();
        }

        @Override
        public void setCount(Integer count) {
            super.setCount(count);
        }
    }


}
class LimitedCounterTest{
    class Tester extends LImitedCounter {

        public Tester(Integer min, Integer max) {
            super(min, max);

        }
    }
}
class StopCounterTest{
     public void start() {
         RolloverCounter tester = new RolloverCounter();
         System.out.println("Test Standard Konstruktor erwartet 0 und geliefert wird 0"+
                 (tester.minimumIs()==-0 ? " ok":"fehler"));
         System.out.println("Test is Obergrenze erwarte 999 und geliefert wird 999"+
                 (tester.isMinimumReached()==true ?" ok":"fehler"));
         tester.count();
         /*System.out.println("Test isMaximumReached erwarted false und geliefert wird false"+
                 (tester.isMinimumReached()==false ? " ok":"fehler"));
         System.out.println("Test Standard Konstruktor erwartet 0 und geliefert wird 0"+
                 (tester.currentCount()==0 ? " ok":"fehler"));
         System.out.println("Test maximumIs erwartet 999 und geliefert wird 999"+
                 (tester.maximumIs()==999 ? " ok":"fehler"));
         System.out.println("Test is maximumreached erwarte false und geliefert wird false"+
                 (tester.isMaximumReached()==false ?" ok":"fehler"));
         tester.setCount(999);
         System.out.println("Test isMaximumReached erwarted true und geliefert wird true"+
                 (tester.isMaximumReached()==true ? " ok":"fehler"));*/

        }
    }
    class WarningCounterTest(){
    public void allgemeineTest() {
    }
}






