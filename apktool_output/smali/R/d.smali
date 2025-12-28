.class public final LR/d;
.super Li2/c;
.source "SourceFile"


# instance fields
.field public g:LR/e;

.field public h:LA2/a;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LR/e;

.field public k:I


# direct methods
.method public constructor <init>(LR/e;Li2/c;)V
    .locals 0

    iput-object p1, p0, LR/d;->j:LR/e;

    invoke-direct {p0, p2}, Li2/c;-><init>(Lg2/d;)V

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LR/d;->i:Ljava/lang/Object;

    iget p1, p0, LR/d;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LR/d;->k:I

    iget-object p1, p0, LR/d;->j:LR/e;

    invoke-virtual {p1, p0}, LR/e;->e(Li2/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
