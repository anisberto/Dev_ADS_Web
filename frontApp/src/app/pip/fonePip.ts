import {PipeTransform, Pipe} from '@angular/core';

@Pipe({name: 'maskFone'})
export class fonePip implements PipeTransform{
    transform(value: String): String{
        let part1 = value.substring(0,2);
        let part2 = value.substring(2,3);
        let part3 = value.substring(3,7);
        let part4 = value.substring(7,11);
        return `(${part1}) ${part2} ${part3}-${part4}`;
    }
}