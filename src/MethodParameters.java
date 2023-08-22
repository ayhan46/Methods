public class MethodParameters {
    public static void main(String[] args) {

        konsolCiktisi("Ayhan");
        konsolCiktisi("Tayfun");
        toplamaIslemi(5, 10);
        toplamaIslemi(100, 456);
        sinavNotlari("Ayhan",100);
        sinavNotlari("Tayfun",50);

        System.out.println("------------");
        System.out.println(carpma(5,9));
        System.out.println(carpma(10,2));
        System.out.println(toplamaIslemi(50,100));
        System.out.println(toplamaIslemi(20,15,66));
        System.out.println(toplamaIslemi(8.0,4.5));


    }

    private static void konsolCiktisi(String isim){
        System.out.println("Merhaba Dunya!" + " ve merhaba " + isim);
    }

    private static int toplamaIslemi(int a,int b){
        return a+b;
    }

    private static int toplamaIslemi(int a,int b,int c){
        return a+b+c;
    }

    private static double toplamaIslemi(double a,double b) {
        return a + b;
    }


    private static void sinavNotlari(String ad, int not){
        System.out.println(ad + " isimli ogrencinin notu " + not);
    }

    private static int carpma(int a, int b){
        int carpmaSonucu = a*b;
        return carpmaSonucu;

    }
}
