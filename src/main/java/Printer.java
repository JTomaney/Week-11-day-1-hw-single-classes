public class Printer {

    private int sheets;
    private int toner;

    public Printer(int numOfSheets, int toner){
        this.sheets = numOfSheets;
        this.toner = toner;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        int sheetsRequired = pages * copies;
       if (sheetsRequired <= this.sheets){
           this.sheets -= sheetsRequired;
           this.toner -= sheetsRequired;
       }
    }

}
