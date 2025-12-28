.class public abstract LA2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA2/j;

.field public static final b:I

.field public static final c:I

.field public static final d:LD2/w;

.field public static final e:LD2/w;

.field public static final f:LD2/w;

.field public static final g:LD2/w;

.field public static final h:LD2/w;

.field public static final i:LD2/w;

.field public static final j:LD2/w;

.field public static final k:LD2/w;

.field public static final l:LD2/w;

.field public static final m:LD2/w;

.field public static final n:LD2/w;

.field public static final o:LD2/w;

.field public static final p:LD2/w;

.field public static final q:LD2/w;

.field public static final r:LD2/w;

.field public static final s:LD2/w;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, LA2/j;

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LA2/j;-><init>(JLA2/j;LA2/b;I)V

    sput-object v6, LA2/d;->a:LA2/j;

    const-string v0, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v0, v1, v2, v2, v3}, LD2/a;->k(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, LA2/d;->b:I

    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v1, 0x2710

    invoke-static {v0, v1, v2, v2, v3}, LD2/a;->k(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, LA2/d;->c:I

    new-instance v0, LD2/w;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->d:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->e:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->f:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->g:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "POISONED"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->h:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->i:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->j:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->k:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->l:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->m:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->n:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->o:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->p:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->q:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->r:LD2/w;

    new-instance v0, LD2/w;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1, v2}, LD2/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, LA2/d;->s:LD2/w;

    return-void
.end method

.method public static final a(Ly2/e;Ljava/lang/Object;Lo2/c;)Z
    .locals 0

    invoke-interface {p0, p1, p2}, Ly2/e;->d(Ljava/lang/Object;Lo2/c;)LD2/w;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ly2/e;->w(Ljava/lang/Object;)V

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
