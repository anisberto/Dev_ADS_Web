import { PipeTransform, Pipe } from '@angular/core';

@Pipe({ name: 'cpfPip' })
export class cpfPipe implements PipeTransform {
    transform(value: String): String {
        let p1 = value.substring(0, 3);
        let p2 = value.substring(3, 6);
        let p3 = value.substring(6, 9);
        let p4 = value.substring(9,11);
        let formatado = `${p1}.${p2}.${p3}-${p4}`;
        return formatado;
    }
}