package easemob.hyphenate.calluikit.event;

import easemob.hyphenate.calluikit.utils.EaseCallAction;

/**
 * author lijian
 * email: Allenlee@easemob.com
 * date: 01/12/2021
 */
public class AnswerEvent extends BaseEvent {
    public AnswerEvent(){
        callAction = EaseCallAction.CALL_ANSWER;
    }
    public String result;
    public boolean transVoice;
}
