//#20
void spansegments() {
  value one9 = "123456789";
  check((1..20).span(5,3).sequence=={6,5,4}, "Backward span [1] '" (1..20).span(5,3).sequence "'");
  check({1,2,3,4,5,6,7,8,9}.span(5,3)=={6,5,4}, "Backward span [2] '" {1,2,3,4,5,6,7,8,9}.span(5,3) "'");
  check(one9.span(5,3)=="654", "Backward span [3] '" one9.span(5,3) "'");
  check(array(1,2,3,4,5,6,7,8,9).span(5,3)=={6,5,4}, "Backward span [4] '" array(1,2,3,4,5,6,7,8,9).span(5,3) "'");
  check(LazyList(1,2,3,4,5,6,7,8,9).span(5,3)=={6,5,4}, "Backward span [5] '" LazyList(1,2,3,4,5,6,7,8,9).span(5,3) "'");

  check((1..20).segment(1,-1).sequence=={}, "Backward segment [1] '" (1..20).segment(1,-1).sequence "'");
  check({1,2,3,4,5,6,7,8,9}.segment(1,-1)=={}, "Backward segment [2] '" {1,2,3,4,5,6,7,8,9}.segment(1,-1) "'");
  check(one9.segment(1,-1)=="", "Backward segment [3] '" one9.segment(1,-1) "'");
  check(array(1,2,3,4,5,6,7,8,9).segment(1,-1)=={}, "Backward segment [4] '" array(1,2,3,4,5,6,7,8,9).segment(1,-1) "'");
  check(LazyList(1,2,3,4,5,6,7,8,9).segment(1,-1)=={}, "Backward segment [5] '" LazyList(1,2,3,4,5,6,7,8,9).segment(1,-1) "'");
}