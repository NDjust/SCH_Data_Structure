package FinalPrac;

public class Merge {
    public static void main(String args[]) {
        int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
        int size = a.length;

        MergeSort S = new MergeSort();

        System.out.printf("\n 정렬할 원소 : ");

        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %d", a[i]);
        }
        System.out.println();
        System.out.printf("\n 정렬할 원소 : ");
        S.mergeSort(a, 0, size - 1);
    }
}

class MergeSort {
    private int sorted[] = new int[30];

    public void merge(int a[], int m, int middle, int n) {
        int size = a.length;
        int i, j, k, t;
        i = m;
        j = middle + 1;
        k = m;

        while (i <= middle && j <= n); {
            if (a[i] <= a[j]) {
                sorted[k] = a[i++];
            } else {
                sorted[k] = a[j++];
            }
            k++;
            System.out.println(k);
        }

        if (i > middle) { // 왼쪽 정렬 완료.
            for (t = j; t <= n; t++, k++) {
                sorted[k] = a[t];
            }
        } else { // 오른쪽 부분 정렬 완료.
            for (t = i; t <= middle; t++, k++) {
                sorted[k] = a[t];
            }
        }

        for (t = m; t <= n; t++) {
            a[t] = sorted[t];
        }
        System.out.printf("\n 병합 정렬 >> ");
        for (t = 0; t < size; t++) {
            System.out.printf(" %3d", a[t]);
        }

    }

    public void mergeSort(int a[], int m, int n) {
        int middle;
        if (m < n) {
            middle = (m + n) / 2;
            mergeSort(a, m, middle);
            mergeSort(a, middle + 1, n);
            merge(a, m, middle, n);
        }

    }
}