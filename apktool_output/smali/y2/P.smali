.class public final Ly2/P;
.super Ly2/U;
.source "SourceFile"


# static fields
.field public static final i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _invoked:I

.field public final h:Lo2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Ly2/P;

    const-string v1, "_invoked"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ly2/P;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lo2/c;)V
    .locals 0

    invoke-direct {p0}, LD2/k;-><init>()V

    iput-object p1, p0, Ly2/P;->h:Lo2/c;

    return-void
.end method


# virtual methods
.method public final bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ly2/P;->p(Ljava/lang/Throwable;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    sget-object v2, Ly2/P;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly2/P;->h:Lo2/c;

    invoke-interface {v0, p1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
