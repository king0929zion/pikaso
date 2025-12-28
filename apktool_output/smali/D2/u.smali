.class public abstract LD2/u;
.super LD2/c;
.source "SourceFile"

# interfaces
.implements Ly2/f0;


# static fields
.field public static final g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile cleanedAndPointers:I

.field public final f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LD2/u;

    const-string v1, "cleanedAndPointers"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LD2/u;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(JLD2/u;I)V
    .locals 0

    invoke-direct {p0, p3}, LD2/c;-><init>(LD2/u;)V

    iput-wide p1, p0, LD2/u;->f:J

    shl-int/lit8 p1, p4, 0x10

    iput p1, p0, LD2/u;->cleanedAndPointers:I

    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 2

    sget-object v0, LD2/u;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, LD2/u;->f()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LD2/c;->b()LD2/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final e()Z
    .locals 2

    sget-object v0, LD2/u;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/high16 v1, -0x10000

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->addAndGet(Ljava/lang/Object;I)I

    move-result v0

    invoke-virtual {p0}, LD2/u;->f()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LD2/c;->b()LD2/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public abstract f()I
.end method

.method public abstract g(ILg2/i;)V
.end method

.method public final h()V
    .locals 2

    sget-object v0, LD2/u;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, LD2/u;->f()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LD2/c;->d()V

    :cond_0
    return-void
.end method

.method public final i()Z
    .locals 3

    :cond_0
    sget-object v0, LD2/u;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {p0}, LD2/u;->f()I

    move-result v2

    if-ne v1, v2, :cond_2

    invoke-virtual {p0}, LD2/c;->b()LD2/c;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/high16 v2, 0x10000

    add-int/2addr v2, v1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    return v0
.end method
