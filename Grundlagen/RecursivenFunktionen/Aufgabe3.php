<?php

function binary_search($arr, $x) {
    $low=0;
    $high = sizeof($arr) -1 ;
     $erg=false;
    while ($low <=$high) {
        $mid=floor ( ($low + $high) /2 );
        $midr=ceil ( ($low + $high) /2 );
        
        if  ($arr[$mid]==$x) {
            $erg=true;
            break;
//                 return $mid;
        }
        
        if ($arr[$midr]==$x) {
             $erg=true;
             break;
//                 return $midr;
            }
        
        
        if ($x < $arr[$mid]) {
            $high=$mid-1;
        }
        else {
            $low = $mid+1;
        }
    }
    var_dump($erg);
//     return -1;
}

$arr1=array(2, 5, 7, 11, 14, 22, 30, 31, 43, 74);

binary_search($arr1, 22);

?>