public class Kalkulator implements OperasiHitung{
    @Override
    public double faktorial(double x) {
        if (x > 1){
            return x * faktorial(x-1);
        }
        else {
            return 1;
        }
    }

    @Override
    public double pangkat(double x, double y) {
        if (y == 0){
            return  1;
        }
        else {
            return  x * pangkat(x,y-1);
        }
    }

    @Override
    public double perkalian(double x, double y) {
        return x*y;
    }

    @Override
    public double pembagian(double x, double y) {
        if (y!=0){
            return x/y;
        }else {
            System.out.println("Error : Tidak bisa dibagi dengan nol !!");
            return 0;
        }
    }
    public double sisabagi(double x, double y){
        return x%y;
    }
}
