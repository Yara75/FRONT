export interface Infos {
    id?: number; 
    nom: string;
    prenom: string;
}

export interface Diploma {
    id? : number;
    obtentionDate : Date;
    name : string; 
    school : string; 
}

export interface Expro{
    id? : number;
    nameC: string; 
    beginD: Date;
    endD: Date;
    job: string;
}

export interface Skills{
    id?: number; 
    domains: string;
    details: string;
}

export interface Certif{
    id?: number;
    name: string;
    domain: string;
}



