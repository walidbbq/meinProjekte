<?php
function hotelzimmerStockwerke($stockwerke, $zimmer){
    
    $zn=100;
    $stock=array();
    
    for ($i=0; $i < $stockwerke ;$i++){
        
        for ($j=0; $j<=$zimmer ; $j++) {
            $stock[$i][$j]=$zn;    
            $zn++;
        }
        
        $zn=$zn-$j;
        $zn=$zn+100;

        
}
 print_r($stock);

}
 hotelzimmerStockwerke(3, 5);

?>