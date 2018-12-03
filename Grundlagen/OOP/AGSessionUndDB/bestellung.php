<?php

class bestellung {
    
    public $VornameKunde;
    public $NachnameKunde;
    public $strasse;
    public $hausnr;
    public $plz;
    public $wohnort;
    public $bestellung;
    
    
    function  __construct ($vork,$nachk,$str,$hnr,$plz,$wort,$bestg){
        
        $this->VornameKunde=$vork;
        $this->NachnameKunde=$nachk;
        $this->strasse=$str;
        $this->hausnr=$hnr;
        $this->plz=$plz;
        $this->wohnort=$wort;
        $this->bestellung=$bestg;
}


    
    
}

?>