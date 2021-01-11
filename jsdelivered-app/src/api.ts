import axios from "axios"

export function fetchProducts(){
    const host = 'http://localhost:8080';
    return axios(`${host}/products`);
}