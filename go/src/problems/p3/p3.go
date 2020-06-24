package problems

import (
	"strings"
)

func lengthOfLongestSubstring(s string) int {
	maxLength := 0

	for index := range s {
		if len(s)-index > maxLength {
			maxOfSub := lengthUntilFirstDup(s[index:])

			if maxOfSub > maxLength {
				maxLength = maxOfSub
			}
		}
	}

	return maxLength
}

func lengthUntilFirstDup(s string) int {

	chars := ""

	for _, char := range s {
		if !strings.Contains(chars, string(char)) {
			chars = chars + string(char)
		} else {
			return len(chars)
		}
	}

	return len(chars)
}
