
public static void main(String[] args) {
    String chuoi;
    char kytu;
    scanner scanner = new Scanner(System.in);
    System.out.println("Nhap vao mot chuoi ky tu tu ban phim");
    chuoi= scanner.nextLine();
    System.out.println("Cac ky tu co trong chuoi la:");
    for (int i = 0; i < chuoi.Length(); i++){
    kytu = chuoi.charat(i);
    System.out.println(kytu);
}
}