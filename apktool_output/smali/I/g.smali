.class public final LI/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lq2/a;


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(LL/d;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, LI/g;->d:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 2
    new-array v1, v0, [LI/o;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    new-instance v3, LI/q;

    invoke-direct {v3, p0}, LI/q;-><init>(LI/g;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, LI/e;

    invoke-direct {v0, p1, v1}, LI/e;-><init>(LL/d;[LI/o;)V

    iput-object v0, p0, LI/g;->e:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Lc0/E;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LI/g;->d:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iget-object p1, p1, Lc0/E;->m:Ljava/util/List;

    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LI/g;->e:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, LI/g;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LI/g;->e:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, LI/g;->e:Ljava/util/Iterator;

    check-cast v0, LI/e;

    iget-boolean v0, v0, LI/d;->f:Z

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    iget v0, p0, LI/g;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LI/g;->e:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/G;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LI/g;->e:Ljava/util/Iterator;

    check-cast v0, LI/e;

    invoke-virtual {v0}, LI/e;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, LI/g;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, LI/g;->e:Ljava/util/Iterator;

    check-cast v0, LI/e;

    invoke-virtual {v0}, LI/e;->remove()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
