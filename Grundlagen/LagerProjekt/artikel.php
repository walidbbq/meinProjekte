<?php
class artikel {
    
    public $Aid;
    public $Aname;
    public $Lpreis;
    public $Vpreis;
    public $Lid;
    public $Kaid;
    public $Laid;
    public $menge;
    
    function __construct($aid,$aname,$lpreis,$vpreis,$lid,$kaid,$laid) {
        $this->Aid=$aid;
        $this->Aname=$aname;
        $this->Lpreis=$lpreis;
        $this->Vpreis=$vpreis;
        $this->Lid=$lid;
        $this->Kaid=$kaid;
        $this->Laid=$laid;
        
 
    }
    
}

?>