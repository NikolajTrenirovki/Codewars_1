class SmallestIntegerFinder {
    fun findSmallestInt(nums: List<Int>): Int? {
        var result = 100000
        for(i in nums.indices){
            if (nums[i]<result)
                result = nums[i]
        }
        return result // Implement me!
    }

   // fun findSmallestInt2(nums: List<Int>) = nums.min()!!

}