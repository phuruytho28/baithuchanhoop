public static void main(String[] args)  {
        int n, m;
        scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao so dong cua ma tran:");
        n = scanner.nextInt();
        System.out.println("nhap vao so cot cua ma tran:");
        m = scanner.nextInt();
        int A[] [] = new int [n] [m];
        System.out.println("Nhap cac phan tu cho ma tran:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.println("A[" + i + "] [" + j + "]");
                A[i] [j]= scanner.nextInt();
            }
        }
        int max= A[0] [0];
        for(int i = 0; i < n; i++){
            for (|int j=0; j < m; j++){
                if (max< A [i] [j] ){
                    max = A [i] [j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran=" + max);
    }
