<?php

echo "===A===";

function zeichne_rechteck ($breite , $hoehe){
    
    for ($i=0; $i<$hoehe;$i++) {
        for ($j=0; $j<$breite; $j++){
            echo "*";
            
        }
        echo "<br>";
    }
}

echo "<br>";
zeichne_rechteck(5, 4);
 


 echo "===B===";

function zeichne_rechteck_leer ($breite , $hoehe){
    
    
    for ($i=0; $i<=$hoehe;$i++) {
                
        for ($j=0; $j<=$breite; $j++){
            
            //             if (
            //              ($i!=1) And ($i!=$hoehe)
            //                 AND
            //              ($j!=1) And ($j!=$breite)
            //                )
            //             echo "x";
            //             else {
            //                 echo "*";
            //               }
            
            if (
                ($i<1) OR ($i==$hoehe)
                 OR
                ($j<1) OR ($j==$breite)
                )
                echo "*";
                else{
                    echo "x";
                }
                }
        
        echo "<br>";
    }
}
echo "<br>";
zeichne_rechteck_leer(5, 4);

?>