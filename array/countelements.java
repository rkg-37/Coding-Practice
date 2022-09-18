// count the number of elements have a values less than itself ahead

class countelements {

    public int countElements(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(nums));
        Collections.sort(arr); // 2,7,11,15

        for(int i=1;i<arr.length-1;i++){

        }


        }

    public static void main(String[] args){
        int[] nums = {11,7,2,15};
        countelements ce = new countelements();
        int a  = ce.countElements(nums);
        System.out.println(a);
    }

}