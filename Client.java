package TP0;

Public class Data{
    private final String _id;
    private String _prenom;
    private String _nom;
    private String _telephone;
    private String _rue;
    private String _ville;
    private String _etat;
    private String _code;
    private String _pays;
    private String _mail;

public Data(DataBuilder db) {
     /**
     * Le constructeur avec un builder
     * @param db 
     */
     _id = db._id;
     _prenom = db._prenom;
     _nom = db._nom;
     _telephone = db._telephone;
     _rue = db._rue;
     _ville = db._ville;
     _etat = db._etat;
     _code = db._code;
     _pays = db._pays;
     _mail = db._mail;     
   }

    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }
    public String getPrenom() {
        return _prenom;
    }
    public String getNom() {
        return _nom;
    }
    public String getTelephone() {
        return _telephone;
    }
    public String getRue() {
        return _rue;
    }
    public String getVille() {
        return _ville;
    }
    public String getEtat() {
        return _etat;
    }
    public String getCode() {
        return _code;
    }
    public String getPays() {
        return _pays;
    }
    public String getMail() {
        return _mail;
    }
    /**
     * @param _commentaires the _commentaires to set
     */
    public void setPrenom(String _prenom) {
         this._prenom = _prenom;
    }
    public void setNom(String _nom) {
         this._nom = _nom;
    }
    public void setTelephone(String _telephone) {
         this._telephone = _telephone;
    }
    public void setRue(String _rue) {
         this._rue = _rue;
    }
    public void setVille(String _ville) {
         this._ville = _ville;
    }
    public void setEtat(String _etat) {
         this._etat = _etat;
    }
    public void setCode(String _code) {
         this._code = _code;
    }
    public void setPays(String _pays) {
         this._pays = _pays;
    }
    public void setMail(String _mail) {
         this._mail = _mail;
    }

    /**
     * Une classe builder interne (et static)
     * a utiliser par new Data.DataBuilder(___).attribut1(_)....build();
     */
    public static class DataBuilder {

        /**
         * Ide de la data (obligatoire)
         */
        private final String _id;
        private String _prenom;
        private String _nom;
        private String _telephone;
        private String _rue;
        private String _ville;
        private String _etat;
        private String _code;
        private String _pays;
        private String _mail;
        /** 
         * Constructeur minimal du pattern Builder 
         * est la Liste des attributs obligatoires
         * @param id
         * @param data 
         */
        public DataBuilder(String id) {
            _id=id;
        }
        /**
         * Param�tre de build tout attribut optionnel renvoi un builder
         * @param commentaire
         * @return un DataBuilder pour encha�ner les mise a jour du builder
         */
        public DataBuilder prenom(String prenom) {
            _prenom = prenom;
            return this;
        }
        public DataBuilder nom(String nom) {
            _nom = nom;
            return this;
        }
        public DataBuilder telephone(String telephone){
            _telephone = telephone;
            return this;
        }
        public DataBuilder rue(String rue) {
            _rue = rue;
            return this;
        }
        public DataBuilder ville(String ville) {
            _ville = ville;
            return this;
        }
        public DataBuilder etat(String etat) {
            _etat = etat;
            return this;
        }
        public DataBuilder code(String code) {
            _code = code;
            return this;
        }
        public DataBuilder pays(String pays) {
            _pays = pays;
            return this;
        }
        public DataBuilder mail(String mail) {
            _mail = mail;
            return this;
        }
        
        /**
         * Le build
         * @return objet � cr�er
         */
        public Data build(){
            return new Data(this);
        }
    }
}
