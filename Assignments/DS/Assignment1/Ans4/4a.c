int mem_release(int **table){
    if(table==NULL)
      return -1;
      
  int i=0;
  while(table[i]!=NULL){
    free(table[i]);
    table[i]=NULL;
    i++;
  }
  free(table);
  table=NULL;
  return 1;
}
