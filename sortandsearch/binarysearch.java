static int BinarySearch(int[] arr, int key, int low, int high) {
  if (high < low) {
      return -1;
  }
  
  int mid = low + ((high - low) / 2);
  
  if (key == arr[mid]) {
      return mid;
  } else if (key < arr[mid]) {
      return BinarySearch(arr, key, low, mid - 1);
  } else {
      return BinarySearch(arr, key, mid + 1, high);
  }
}
