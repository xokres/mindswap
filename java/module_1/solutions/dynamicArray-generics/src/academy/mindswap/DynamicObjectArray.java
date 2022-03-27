package academy.mindswap;

/**
 * A CLASS THAT REPRESENTS A MUTABLE ARRAY
 */
public class DynamicObjectArray<T> {

    private Object[] objects;
    private int objectsCreated;

    /**
     * BASE ARRAY INITIALIZED WITH DEFAULT SIZE
     */
    public DynamicObjectArray() {
        objects = new Object[2];
        objectsCreated = 0;
    }

    /**
     * ADD METHOD CHECKS IF ARRAY IS FULL.
     * IF IT IS, GROWS IT.
     * IF IT ISN'T, FINDS THE FIRST AVAILABLE INDEX AND STORES THE GIVEN OBJECT IN IT.
     * @param object - THE OBJECT TO ADD
     */
    public void add(T object) {
        if (objectsCreated == objects.length) {
            growArray();
        }

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = object;
                break;
            }
        }

        objectsCreated++;
    }

    /**
     * CREATES A NEW, TEMPORARY ARRAY WITH DOUBLE THE SIZE.
     * COPIES THE CONTENTS OF THE ORIGINAL ARRAY INTO THE NEW ONE.
     * SUBSTITUTES THE OBJECT REFERENCED BY THE objects PROPERTY.
     */
    private void growArray() {
        Object[] temp = new Object[objects.length * 2];

        for (int i = 0; i < objects.length; i++) {
            temp[i] = objects[i];
        }

        objects = temp;
    }

    /**
     * VERIFIES IF THE INDEX SPECIFIED EXISTS, AND IF IT DOES, CHECKS IF THERE'S AN ACTUAL OBJECT STORED IN IT.
     * IF BOTH CONDITIONS ARE VERIFIED, THE OBJECT IN THE SPECIFIED POSITION WILL BE REMOVED
     * FINALLY, IT CHECKS IF HALF THE POSITIONS OF THE ARRAY ARE EMPTY. IF THEY ARE, THE ARRAY SHRINKS IN SIZE.
     * @param index - REPRESENTS THE INDEX WHERE THE OBJECT TO BE DELETED IS
     */
    public void remove(int index) {
        if (index >= objects.length || objects[index] == null) {
            return;
        }

        objects[index] = null;
        objectsCreated--;

        if (objectsCreated == objects.length / 2) {
            shrinkArray();
        }
    }

    /**
     * CREATES A NEW, TEMPORARY ARRAY, WITH HALF THE SIZE OF THE ORIGINAL ONE.
     * COPIES THE ELEMENTS OF THE ORIGINAL ARRAY INTO THE NEW ONE.
     * SUBSTITUTES THE OBJECT REFERENCED BY THE objects PROPERTY.
     */
    private void shrinkArray() {
        Object[] temp = new Object[objects.length / 2];

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < objects.length; j++) {
                if(objects[j] != null){
                    temp[i] = objects[j];
                    objects[j] = null;
                    break;
                }
            }
        }

        objects = temp;
    }

    /**
     * @return THE LENGTH OF THE BASE ARRAY
     */
    public int getLength(){
        return objects.length;
    }

    /**
     * PRINTS THE ELEMENTS INSIDE THE ARRAY
     */
    public void printElements(){
        for (Object o : objects){
            System.out.println(o);
        }
    }

    public T get(int index) {
        return index < objects.length ? (T)objects[index] : null;
    }
}
