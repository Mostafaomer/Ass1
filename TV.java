package assignment._1;
public class TV 
{
    int channel,volumeLevel;
    boolean on ;
    public TV()
        {
            volumeLevel=5;
            channel=60;
        }
    public void turnOn()
        {
            on=true;
        }     
    public void turnOff()
        {
            on=false;
        }    
    public void setChannel(int newChannel)
        {
            channel=newChannel;
        }      
    public void setVolume(int newVolumeLevel)
        {
            volumeLevel=newVolumeLevel;
        }      
    public void channelUp()
        {
            channel++;
            System.out.println(channel);    
        }      
    public void channelDown()
        {
            channel--;
        System.out.println(channel);
            System.out.println(channel); 
        }
    public void volumeUp()
        {
            volumeLevel++;
            System.out.println(volumeLevel);
        }      
    public void volumeDown()
        {
             volumeLevel--;
             System.out.println(volumeLevel);
        }              
}
