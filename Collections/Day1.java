 // what is difference between hashmap and hashTable in java
/*   Key Differences
   1. Thread Safety
   hash map is not Synchronized,making making it 
   Faster but not thread safe

   HashTable is Synchronized , making it thread-safe but slower
   
   2. Null key/Values
   hash map allow one null key and multiple null values

   hashTable does not allow null key and value

   3. Perfomance
   hash map is faster because it does not have overload of Synchronization
  
   hash table is slower becuse it has overload of Synchronization

   4. Legacy and Modern

   hash map is introduced in java 1.2 as part of collection and Framework

   hash table is a legcy from java 1.0
 */
//  What is Differece between Hashmap and Linked hash map
/*
      hash map - unorder ,faster for general purpose uses

      Linked hashmap - maintain insertion and access order useful for implement LRU cache
      store value in key and value format
      duplicate value are alloewed
      null key are allowed
      Only one key are allowed 
      .if you try to insert a new entry with key that already exists , the new value value will 
      .overwrite the value associated with the existing key
      .used when insertion order needs to be maintained

 */
// 5. String Buffer and String Builder ?
/*
     Stringbuffer
     mutable class
     Synchronized -->mens multiple thread can not apply at same time but one thread access at one time
     thread safe
     used in multithread environments
     method used append(),insert(),reverse()

     StringBuilder
     mutable class
     non-Synchronized -- multilple thread can access at same time
     not thread safe
     used in single thread environment
 */
// Differnce between Collections and Collection
/*     
   Collections:
   .it is a utility class
   .we can import from java.util package
   . perform operation on collection object
   . it provides static method for operation like Sorting ,searching,reversing

   Collection :
   it is interface ,
   represent group of objects(list,set,queue)
   provides method like add , remove,size()
   ex.ArrayList(),HashSet(),LinkedList()

 */
