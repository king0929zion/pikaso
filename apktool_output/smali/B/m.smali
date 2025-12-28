.class public final Lb/m;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/a;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lb/r;


# direct methods
.method public synthetic constructor <init>(Lb/r;I)V
    .locals 0

    iput p2, p0, Lb/m;->e:I

    iput-object p1, p0, Lb/m;->f:Lb/r;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lb/m;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb/m;->f:Lb/r;

    invoke-virtual {v0}, Lb/r;->a()V

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lb/m;->f:Lb/r;

    iget-object v1, v0, Lb/r;->c:Ls1/f;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    iget-object v1, v0, Lb/r;->b:Ld2/i;

    invoke-virtual {v1}, Ld2/f;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ls1/f;

    iget-boolean v4, v4, Ls1/f;->a:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    check-cast v3, Ls1/f;

    :cond_2
    iput-object v2, v0, Lb/r;->c:Ls1/f;

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lb/m;->f:Lb/r;

    invoke-virtual {v0}, Lb/r;->a()V

    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
