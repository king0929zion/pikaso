.class public final LD1/q;
.super LD1/p;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ln/f;

.field public final synthetic b:LD1/r;


# direct methods
.method public constructor <init>(LD1/r;Ln/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD1/q;->b:LD1/r;

    iput-object p2, p0, LD1/q;->a:Ln/f;

    return-void
.end method


# virtual methods
.method public final d(LD1/o;)V
    .locals 2

    iget-object v0, p0, LD1/q;->b:LD1/r;

    iget-object v0, v0, LD1/r;->e:Landroid/view/ViewGroup;

    iget-object v1, p0, LD1/q;->a:Ln/f;

    invoke-virtual {v1, v0}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, LD1/o;->u(LD1/n;)V

    return-void
.end method
