
class IntegerCacheDemo{
	public static void main(String[] args){

	int[] arr1 = {10,20,30,40,50};
	int[] arr2 = new int[]{10,20,30,40,50}; 
	}
}

/*
 *kishor@hp:~/java26/dailycodes/lec10$ javap -c IntegerCacheDemo.class
Compiled from "Prog13.java"
class IntegerCacheDemo {
  IntegerCacheDemo();
    Code:
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return

  public static void main(java.lang.String[]);
    Code:
         0: iconst_5
         1: newarray       int
         3: dup
         4: iconst_0
         5: bipush        10
         7: iastore
         8: dup
         9: iconst_1
        10: bipush        20
        12: iastore
        13: dup
        14: iconst_2
        15: bipush        30
        17: iastore
        18: dup
        19: iconst_3
        20: bipush        40
        22: iastore
        23: dup
        24: iconst_4
        25: bipush        50
        27: iastore
        28: astore_1
        29: iconst_5
        30: newarray       int
        32: dup
        33: iconst_0
        34: bipush        10
        36: iastore
        37: dup
        38: iconst_1
        39: bipush        20
        41: iastore
        42: dup
        43: iconst_2
        44: bipush        30
        46: iastore
        47: dup
        48: iconst_3
        49: bipush        40
        51: iastore
        52: dup
        53: iconst_4
        54: bipush        50
        56: iastore
        57: astore_2
        58: return
}
 * */
