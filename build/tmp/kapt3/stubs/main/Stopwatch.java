
import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"LStopwatch;", "", "()V", "active", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "formattedTime", "getFormattedTime", "()Ljava/lang/String;", "setFormattedTime", "(Ljava/lang/String;)V", "formattedTime$delegate", "Landroidx/compose/runtime/MutableState;", "lastTimeStamp", "", "timeMillis", "formatTime", "pause", "", "reset", "start", "Main"})
public final class Stopwatch {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState formattedTime$delegate = null;
    private kotlinx.coroutines.CoroutineScope coroutineScope;
    private boolean active = false;
    private long timeMillis = 0L;
    private long lastTimeStamp = 0L;
    
    public Stopwatch() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormattedTime() {
        return null;
    }
    
    public final void setFormattedTime(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void start() {
    }
    
    public final void pause() {
    }
    
    public final void reset() {
    }
    
    private final java.lang.String formatTime(long timeMillis) {
        return null;
    }
}