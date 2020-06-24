package p4

import (
	"fmt"
	"math"
	"strconv"
)

func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {

	mergedArray := mergeSortedArray(nums1, nums2)
	fmt.Println("merged array: " + convertToString(mergedArray))

	return findMedian(mergedArray)
}

func convertToString(array []int) string {
	buf := ""
	for _, val := range array {
		buf = buf + strconv.Itoa(val)
	}
	return buf
}

func mergeSortedArray(array1 []int, array2 []int) []int {

	len1 := len(array1)
	len2 := len(array2)

	index1 := 0
	index2 := 0

	buf := []int{}

	val1 := getOrMax(index1, array1)
	val2 := getOrMax(index2, array2)

	for index1 < len1 || index2 < len2 {
		fmt.Printf("len1: %d, len2: %d\n", len1, len2)
		fmt.Printf("i1: %d, i2 %d\n", index1, index2)
		fmt.Printf("val1: %d, val2 %d\n", val1, val2)
		if val1 < val2 && index1 < len1 {
			buf = append(buf, val1)
			index1++
			val1 = getOrMax(index1, array1)
		} else if val2 < val1 {
			buf = append(buf, val2)
			index2++
			val2 = getOrMax(index2, array2)
		}
	}

	return buf
}

func getOrMax(pos int, array []int) int {

	length := len(array)

	if length == 0 {
		return math.MinInt64
	}

	return array[pos]
}

func findMedian(nums []int) float64 {

	numsLength := len(nums)
	halfLength := numsLength / 2

	if numsLength%halfLength == 0 {
		return float64((nums[halfLength-1] + nums[halfLength])) / 2
	}

	return float64(nums[halfLength])
}
