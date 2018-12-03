<?php

class Zimmer {
    // Attribute
    public $zimmernummer;
    public $belegstatus;
    
    function __construct($zimmernummer, $belegstatus) {
        $this->zimmernummer = $zimmernummer;
        $this->belegstatus = $belegstatus;
    }
}


function zimmerErzeugen($stockwerke, $zimmer) {
	$hotel = array ();
	for($i = 1; $i <= $stockwerke; $i ++) {
		$temp = array();
		for($j = 1; $j <= $zimmer; $j ++) {
			
			$random = rand(1,10);
			if ($random==10) {
				$temp[] = new Zimmer( $i * 100 + $j, False);
			} else {
				$temp[] = new Zimmer( $i * 100 + $j, True);
			}			
		}
		$hotel[] = $temp;
	}
	return $hotel;
}

$alleZimmer = zimmerErzeugen(4, 5);


function zimmersuche($zimmer_array) {
    for ($i = 0; $i < sizeof($zimmer_array); $i++) {
        for ($j = 0; $j < sizeof($zimmer_array[$i]); $j++) {
            
            if(!$zimmer_array[$i][$j]->belegstatus) {
                return $zimmer_array[$i][$j]->zimmernummer;
            }
        }
    }
    return -1;
}



echo "<pre>" . print_r ( $alleZimmer, True ) . "</pre>";

echo "<br>Freies Zimmer: " . zimmersuche($alleZimmer);


?>
