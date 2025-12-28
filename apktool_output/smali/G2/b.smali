.class public final LG2/b;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LG2/d;

.field public final synthetic g:LG2/c;


# direct methods
.method public synthetic constructor <init>(LG2/d;LG2/c;I)V
    .locals 0

    iput p3, p0, LG2/b;->e:I

    iput-object p1, p0, LG2/b;->f:LG2/d;

    iput-object p2, p0, LG2/b;->g:LG2/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, LG2/b;->e:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    sget-object p1, LG2/d;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v0, p0, LG2/b;->g:LG2/c;

    iget-object v1, v0, LG2/c;->e:Ljava/lang/Object;

    iget-object v2, p0, LG2/b;->f:LG2/d;

    invoke-virtual {p1, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v0, LG2/c;->e:Ljava/lang/Object;

    invoke-virtual {v2, p1}, LG2/d;->d(Ljava/lang/Object;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, LG2/b;->g:LG2/c;

    iget-object p1, p1, LG2/c;->e:Ljava/lang/Object;

    iget-object v0, p0, LG2/b;->f:LG2/d;

    invoke-virtual {v0, p1}, LG2/d;->d(Ljava/lang/Object;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
