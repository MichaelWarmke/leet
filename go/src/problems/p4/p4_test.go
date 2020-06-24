package p4

import "testing"

func TestFindMedianTwoEvenArrays(t *testing.T) {
	nums1 := []int{1, 3}
	nums2 := []int{2, 4}

	expected := 2.5
	actual := findMedianSortedArrays(nums1, nums2)

	if expected != actual {
		t.Errorf("Expected: %f Actual: %f", expected, actual)
	}
}

func TestFindMedianOneEmptyArray(t *testing.T) {
	nums1 := []int{1, 3}
	nums2 := []int{}

	expected := 2.0
	actual := findMedianSortedArrays(nums1, nums2)

	if expected != actual {
		t.Errorf("Expected: %f Actual: %f", expected, actual)
	}
}

func TestFindMedianOtherEmptyArray(t *testing.T) {
	nums1 := []int{}
	nums2 := []int{2, 4}

	expected := 2.0
	actual := findMedianSortedArrays(nums1, nums2)

	if expected != actual {
		t.Errorf("Expected: %f Actual: %f", expected, actual)
	}
}

func TestFindMedianOddArray(t *testing.T) {
	nums1 := []int{1, 3, 5}
	nums2 := []int{2, 4, 6}

	expected := 2.0
	actual := findMedianSortedArrays(nums1, nums2)

	if expected != actual {
		t.Errorf("Expected: %f Actual: %f", expected, actual)
	}
}

func TestFindMedianSizeMisMatch(t *testing.T) {
	nums1 := []int{1, 3, 10, 20, 33, 67}
	nums2 := []int{21, 33}

	expected := 2.0
	actual := findMedianSortedArrays(nums1, nums2)

	if expected != actual {
		t.Errorf("Expected: %f Actual: %f", expected, actual)
	}
}
