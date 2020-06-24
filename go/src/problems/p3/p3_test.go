package problems

import "testing"

func TestFindLongestStringSimpleInline(t *testing.T) {
	expected := 3
	actual := lengthOfLongestSubstring("abcabcbb")

	if actual != expected {
		t.Errorf("Expected: %d Actual: %d", expected, actual)
	}
}

func TestFindLongestStringRepeatedChars(t *testing.T) {
	expected := 1
	actual := lengthOfLongestSubstring("bbbbb")

	if actual != expected {
		t.Errorf("Expected: %d Actual: %d", expected, actual)
	}
}

func TestFindLongestStringDistinctChars(t *testing.T) {
	expected := 9
	actual := lengthOfLongestSubstring("abcdefghi")

	if actual != expected {
		t.Errorf("Expected: %d Actual: %d", expected, actual)
	}
}
