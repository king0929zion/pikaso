.class public final Landroidx/lifecycle/y;
.super Landroidx/lifecycle/g;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Landroidx/lifecycle/A;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/A;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/y;->this$0:Landroidx/lifecycle/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/y;->this$0:Landroidx/lifecycle/A;

    invoke-virtual {p1}, Landroidx/lifecycle/A;->a()V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/y;->this$0:Landroidx/lifecycle/A;

    iget v0, p1, Landroidx/lifecycle/A;->d:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p1, Landroidx/lifecycle/A;->d:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p1, Landroidx/lifecycle/A;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/A;->i:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/lifecycle/A;->g:Z

    :cond_0
    return-void
.end method
