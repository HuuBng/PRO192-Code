package Classes.Com;

import java.util.*;

public class Menu {

    public int int_getChoice(ArrayList<String> Opts) {

        int N = Opts.size();

        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + ". " + Opts.get(i));
        }
        System.out.print("Please choose an option: 1..." + N + ": ");

        int response = Integer.parseInt(new Scanner(System.in).nextLine());
        return response;
    }

    public int int_getChoice(BrandList brands) {

        int N = brands.size();

        System.out.println("------| Please select |------");
        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + ". " + brands.get(i));
        }
        System.out.print("Please choose an option: 1..." + N + ": ");

        int response = Integer.parseInt(new Scanner(System.in).nextLine());
        return response;
    }

    public Brand ref_getChoice(BrandList brands) {

        int response;

        do {
            response = int_getChoice(brands);
        } while (response < 1 || response > brands.size());

        return brands.get(response - 1);
    }

}
